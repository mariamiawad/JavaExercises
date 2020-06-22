//

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.RectHV;
import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdDraw;

public class KdTree {
	private Node root;
	private int size;

	private Point2D nearestPoint = null;
	private Double nearest_distance = Double.MAX_VALUE;

	/**
	 * Construct an empty set of points.
	 */
	public KdTree() {
		size = 0;
	}

	public boolean isEmpty() {
		return root == null;
	}

	/**
	 * @return the number of points in the set.
	 */
	public int size() {
		return size;
	}

	public void insert(Point2D p) {
		if (p == null)
			throw new java.lang.NullPointerException("called insert() with a null Point2D");
		root = insert(root, p, true, new double[] { 0, 0, 1, 1 });
	}

	private Node insert(Node n, Point2D p, boolean evenLevel, double[] coords) {
		if (n == null) {
			size++;
			return new Node(p, coords);
		}

		double cmp = comparePoints(p, n, evenLevel);

		if (cmp < 0 && evenLevel) {
			coords[2] = n.p.x();
			n.lb = insert(n.lb, p, !evenLevel, coords);
		}

		else if (cmp < 0 && !evenLevel) {
			coords[3] = n.p.y();
			n.lb = insert(n.lb, p, !evenLevel, coords);
		}

		else if (cmp > 0 && evenLevel) {
			coords[0] = n.p.x();
			n.rt = insert(n.rt, p, !evenLevel, coords);
		}

		else if (cmp > 0 && !evenLevel) {
			coords[1] = n.p.y();
			n.rt = insert(n.rt, p, !evenLevel, coords);
		}

		else if (!n.p.equals(p))
			n.rt = insert(n.rt, p, !evenLevel, coords);

		return n;
	}

	public boolean contains(Point2D p) {
		if (p == null)
			throw new java.lang.NullPointerException("called contains() with a null Point2D");
		return contains(root, p, true);
	}

	private boolean contains(Node n, Point2D p, boolean evenLevel) {

		if (n == null)
			return false;

		if (n.p.equals(p))
			return true;

		double cmp = comparePoints(p, n, evenLevel);

		if (cmp < 0)
			return contains(n.lb, p, !evenLevel);
		else
			return contains(n.rt, p, !evenLevel);
	}

	/**
	 * Draw all points and partition lines to standard draw.
	 */
	public void draw() {
		draw(root, true);
	}

	private void draw(Node n, boolean evenLevel) {
		if (n == null)
			return;

		// Traverse the left Nodes
		draw(n.lb, !evenLevel);

		// Draw the current Node
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.setPenRadius(0.01);
		n.p.draw();

		// Draw the partition line
		StdDraw.setPenRadius();
		if (evenLevel) {
			StdDraw.setPenColor(StdDraw.RED);
			StdDraw.line(n.p.x(), n.rect.ymin(), n.p.x(), n.rect.ymax());
		} else {
			StdDraw.setPenColor(StdDraw.BLUE);
			StdDraw.line(n.rect.xmin(), n.p.y(), n.rect.xmax(), n.p.y());
		}

		draw(n.rt, !evenLevel);
	}

	public Iterable<Point2D> range(RectHV rect) {
		if (rect == null)
			throw new java.lang.NullPointerException("called range() with a null RectHV");

		Stack<Point2D> points = new Stack<>();

		// Handle KdTree without a root node yet
		if (root == null)
			return points;

		Stack<Node> nodes = new Stack<>();
		nodes.push(root);
		while (!nodes.isEmpty()) {

			Node tmp = nodes.pop();

			if (rect.contains(tmp.p))
				points.push(tmp.p);

			if (tmp.lb != null && rect.intersects(tmp.lb.rect)) {
				nodes.push(tmp.lb);
			}
			if (tmp.rt != null && rect.intersects(tmp.rt.rect)) {
				nodes.push(tmp.rt);
			}
		}
		return points;
	}

	public Point2D nearest(Point2D p) {
		if (p == null)
			throw new java.lang.NullPointerException("called contains() with a null Point2D");
		if (isEmpty())
			return null;

		return nearest(p, root, root.p, true);
	}

	private Point2D nearest(Point2D point, Node node, Point2D nearest, boolean evenLevel) {
		if (node == null) {
			return nearest;
		}

		if (node.p.distanceTo(point) < nearest.distanceTo(point)) {
			nearest = node.p;
		}

		Point2D nearestPossibleFromAnotherNode;
		Node morePrioritizedNode;
		Node lessPrioritizedNode;

		if (evenLevel) {
			nearestPossibleFromAnotherNode = new Point2D(node.p.x(), point.y());

			if (point.x() < node.p.x()) {
				morePrioritizedNode = node.lb;
				lessPrioritizedNode = node.rt;
			} else {
				morePrioritizedNode = node.rt;
				lessPrioritizedNode = node.lb;
			}
		} else {
			nearestPossibleFromAnotherNode = new Point2D(point.x(), node.p.y());

			if (point.y() < node.p.y()) {
				morePrioritizedNode = node.lb;
				lessPrioritizedNode = node.rt;
			} else {
				morePrioritizedNode = node.rt;
				lessPrioritizedNode = node.lb;
			}
		}

		nearest = nearest(point, morePrioritizedNode, nearest, !evenLevel);

		if (nearestPossibleFromAnotherNode.distanceTo(point) < nearest.distanceTo(point)) {
			nearest = nearest(point, lessPrioritizedNode, nearest, !evenLevel);
		}

		return nearest;
	}
//	private void search_childrem(Node a, Node b, RectHV b_bb, Point2D p) {
//		nearest(a, p);
//		boolean even = (size+1)%2 == 0;
//		if (contains_point_closer_than(b_bb,p, nearest_distance, )) {
//		    nearest(b, p);
//		  }
//	}

//	private boolean contains_point_closer_than(RectHV b_bb, Point2D p, double nearest_distance, boolean even) {
//		if (even) {
//			nearest_distance = Math.abs(b_bb.xmax() - p.x());
//		}
//		return false;
//
//	}

	private double comparePoints(Point2D p, Node n, boolean evenLevel) {
		if (evenLevel) {
			return p.x() - n.p.x();
		} else
			return p.y() - n.p.y();
	}

	private static class Node {

		private final Point2D p;

		private final RectHV rect;

		private Node lb;

		// the right/top subtree
		private Node rt;

		private Node(Point2D p, double[] coords) {
			this.p = p;
			rect = new RectHV(coords[0], coords[1], coords[2], coords[3]);
		}
	}

	public static void main(String[] args) {
		In in = new In("file:///C:/Users/maria/eclipse-workspace/coursera/input/week5/input5.txt");
		Iterable<Point2D> iterable = null;
		KdTree tree = new KdTree();
		while (!in.isEmpty()) {
			tree.insert(new Point2D(in.readDouble(), in.readDouble()));
		}
		for (int i = 0; i < 1; i++) {
			Point2D point2d = tree.nearest(new Point2D(0.225, 0.391));

			System.out.println(point2d.x() + "    " + point2d.y());
		}

		Point2D point2d2 = tree.nearest(new Point2D(0.286, 0.569));

		System.out.println(point2d2.x() + "    " + point2d2.y());
		RectHV rectHV = new RectHV(0.1875, 0.6875, 0.75, 0.9375);

		in = new In("file:///C:/Users/maria/eclipse-workspace/coursera/input/week5/range1.txt");
		tree = new KdTree();
		while (!in.isEmpty()) {
			tree.insert(new Point2D(in.readDouble(), in.readDouble()));
		}
		Iterable<Point2D> it = tree.range(rectHV);
		int i = 0;
		while (it.iterator().hasNext() && i < 2) {
			System.out.println(it.iterator().next());
			i++;
		}
	}
}

//import edu.princeton.cs.algs4.In;
//import edu.princeton.cs.algs4.MinPQ;
//import edu.princeton.cs.algs4.Point2D;
//import edu.princeton.cs.algs4.RectHV;
//import edu.princeton.cs.algs4.StdDraw;
//
//public class KdTree {
//	private int size;
//	private Node root;
//
//	private class Node {
//
//		// the point
//		private Point2D p;
//
//		// the axis-aligned rectangle corresponding to this node
//		private RectHV rect;
//
//		// the left/bottom subtree
//		private Node left;
//
//		// the right/top subtree
//		private Node right;
//
//		private Node(Point2D p, double[] coords) {
//			this.p = p;
//			rect = new RectHV(coords[0], coords[1], coords[2], coords[3]);
//		}
//	}
//
//	public KdTree() {
//		// construct an empty set of points
//		root = null;
//
//	}
//
//	public boolean isEmpty() {
//		// is the set empty?
//		return size() == 0;
//	}
//
//	public void insert(Point2D key) {
//		if (key == null)
//			throw new IllegalArgumentException("calls put() with a null key");
//
//		root = insert(root, key, true, new double[] { 0, 0, 1, 1 });
//	}
//
//	private Node insert(Node n, Point2D p, boolean evenLevel, double[] coords) {
//		if (n == null) {
//			size++;
//			return new Node(p, coords);
//		}
//
//		double cmp = comparePoints(p, n, evenLevel);
//		if (cmp < 0 && evenLevel) {
//			coords[2] = n.p.x(); // lessen x_max
//			n.left = insert(n.left, p, !evenLevel, coords);
//		}
//
//		// Handle Nodes which should be inserted to the bottom
//		else if (cmp < 0 && !evenLevel) {
//			coords[3] = n.p.y(); // lessen y_max
//			n.left = insert(n.left, p, !evenLevel, coords);
//		}
//
//		// Handle Nodes which should be inserted to the right
//		else if (cmp > 0 && evenLevel) {
//			coords[0] = n.p.x(); // increase x_min
//			n.right = insert(n.right, p, !evenLevel, coords);
//		}
//
//		// Handle Nodes which should be inserted to the top
//		else if (cmp > 0 && !evenLevel) {
//			coords[1] = n.p.y(); // increase y_min
//			n.right = insert(n.right, p, !evenLevel, coords);
//		}
//
//		else if (!n.p.equals(p))
//			n.right = insert(n.right, p, !evenLevel, coords);
//		return n;
//	}
//
//	private double comparePoints(Point2D p, Node n, boolean evenLevel) {
//		if (evenLevel) {
//			return p.x() - n.p.x();
//		} else
//			return p.y() - n.p.y();
//	}
//
//	public int size() {
//		return size;
//	}
//
//	public boolean contains(Point2D key) {
//		if (key == null)
//			throw new IllegalArgumentException("argument to contains() is null");
//		return get(key) != null;
//	}
//
//	private Double get(Point2D key) {
//		return get(root, key);
//	}
//
//	private Double get(Node x, Point2D key) {
//		if (key == null)
//			throw new IllegalArgumentException("calls get() with a null key");
//		if (x == null)
//			return null;
//		int cmp = key.compareTo(x.p);
//		if (cmp < 0)
//			return get(x.left, key);
//		else if (cmp > 0)
//			return get(x.right, key);
//		else
//			return x.p.x();
//	}
//
//	public void draw() {
//		draw(root, true);
//	}
//
//	private void draw(Node n, boolean evenLevel) {
//		if (n == null)
//			return;
//
//		// Traverse the left Nodes
//		draw(n.left, !evenLevel);
//
//		// Draw the current Node
//		StdDraw.setPenColor(StdDraw.BLACK);
//		StdDraw.setPenRadius(0.01);
//		n.p.draw();
//
//		// Draw the partition line
//		StdDraw.setPenRadius();
//		if (evenLevel) {
//			StdDraw.setPenColor(StdDraw.RED);
//			StdDraw.line(n.p.x(), n.rect.ymin(), n.p.x(), n.rect.ymax());
//		} else {
//			StdDraw.setPenColor(StdDraw.BLUE);
//			StdDraw.line(n.rect.xmin(), n.p.y(), n.rect.xmax(), n.p.y());
//		}
//
//		// Traverse the right Nodes
//		draw(n.right, !evenLevel);
//	}
//
//	public Iterable<Point2D> range(RectHV rect) {
//		// all points that are inside the rectangle (or on the boundary)
//		if (rect == null || root == null) {
//			return null;
//		}
//		MinPQ<Point2D> queue = new MinPQ<>();
//		return range(root, rect, queue);
//	}
//
//	private Iterable<Point2D> range(Node point2d, RectHV rect, MinPQ<Point2D> queue) {
//		// all points that are inside the rectangle (or on the boundary)
//		if (point2d == null) {
//			return queue;
//		}
//		if (rect.contains(point2d.p)
//				|| FindPoint(rect.xmax(), rect.ymax(), rect.xmin(), rect.ymin(), point2d.p.x(), point2d.p.y())) {
//			queue.insert(point2d.p);
//		}
//
////		if (point2d.left != null) {
//		range(point2d.left, rect, queue);
////		} else if (point2d.right != null) {
//		range(point2d.right, rect, queue);
//
////		}
//		return queue;
//	}
//
//	private boolean FindPoint(double xmax, double ymax, double xmin, double ymin, double x, double y) {
//
//		return x >= xmin && x <= xmax && y >= ymin && y <= ymax;
//	}
//
//	public Point2D nearest(Point2D p) {
//        if (p == null) throw new java.lang.NullPointerException(
//                "called contains() with a null Point2D");
//        if (isEmpty()) return null;
//        return nearest(root, p, root.p, true);
//    }
//    
//    private Point2D nearest(Node n, Point2D p, Point2D champion,boolean evenLevel) {
//        
//        // Handle reaching the end of the tree
//        if (n == null) return champion;
//        if (n.p.equals(p)) return p;
//        
//        if (n.p.distanceSquaredTo(p) < champion.distanceSquaredTo(p))
//            champion = n.p;
//        
//   
//        double toPartitionLine = comparePoints(p, n, evenLevel);
//        
//
//        if (toPartitionLine < 0) {
//            champion = nearest(n.left, p, champion, !evenLevel);
//            
//            if (champion.distanceSquaredTo(p) >=
//                    toPartitionLine * toPartitionLine) {
//                champion = nearest(n.right, p, champion, !evenLevel);
//            }
//        }
//        else {
//            champion = nearest(n.right, p, champion, !evenLevel);
//            
//            // Since champion may have changed, recalculate distance
//            if (champion.distanceSquaredTo(p) >=
//                    toPartitionLine * toPartitionLine) {
//                champion = nearest(n.left, p, champion, !evenLevel);
//            }
//        }
//        
//    return champion;
//    }    
//
//	public static void main(String[] args) {
//		In in = new In("file:///C:/Users/maria/eclipse-workspace/coursera/input/week5/input5.txt");
//		Iterable<Point2D> iterable = null;
//		KdTree tree = new KdTree();
//		while (!in.isEmpty()) {
//			tree.insert(new Point2D(in.readDouble(), in.readDouble()));
//		}
//		Point2D point2d = tree.nearest(new Point2D(0.119, 0.856));
//		System.out.println(point2d.x() + "    " + point2d.y());
//		RectHV rectHV = new RectHV(0.1875, 0.6875, 0.75, 0.9375);
//
//		in = new In("file:///C:/Users/maria/eclipse-workspace/coursera/input/week5/range1.txt");
//		tree = new KdTree();
//		while (!in.isEmpty()) {
//			tree.insert(new Point2D(in.readDouble(), in.readDouble()));
//		}
//		Iterable<Point2D> it = tree.range(rectHV);
//		int i = 0;
//		while (it.iterator().hasNext() && i < 2) {
//			System.out.println(it.iterator().next());
//			i++;
//		}
//	}
//
////		Scanner scanner = new Scanner(System.in);
////		KdTree  kdTree  =new KdTree();
////		String [] strings = new String[10];
////		
////		RectHV rectHV = new RectHV(0.127, 0.634,0.186, 0.99);
////		for (int i = 0; i < strings.length; i++) {
////			strings[i] = scanner.next();
////			
////			kdTree.insert(new Point2D(scanner.nextDouble(), scanner.nextDouble()));
////			
////		}
////		Iterable<Point2D> iterable = kdTree.range(rectHV);
////		while (iterable.iterator().hasNext()) {
////			System.out.println(iterable.iterator().next());
////			
////		}
//
//}
