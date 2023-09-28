import java.util.*;
public class Tree{
	static class Node{
		int data;
		Node left;
		Node right;

		public Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	static class BinaryTree{
		static int idx = -1;
		public static Node buildTree(int nodes[]){
			idx++;
			if(nodes[idx] == -1){
				return null;
			}
			
			Node newNode = new Node(nodes[idx]);
			newNode.left = buildTree(nodes);
			newNode.right = buildTree(nodes);
			return newNode;
		}

		public static void preorder(Node root){
			if(root == null){
				return;
			}
					
			System.out.print(root.data+" ");
			preorder(root.left);
			preorder(root.right);
		}

		public static void inorder(Node root){
			if(root == null){
				return;
			}
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
		}

		public static void postorder(Node root){
			if(root == null){
				return;
			}
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data+" ");
		}
		public static void levelOrderTraversal(Node root){
			if(root == null){
				return;
			}
		
			Queue<Node> q = new LinkedList<>();
			q.add(root);
			q.add(null);
			while(!q.isEmpty()){
				Node currNode = q.remove();
				if(currNode == null){
					System.out.println();
					if(q.isEmpty()){
						break;
					} else {
						q.add(null);
					}
				}else{
					System.out.print(currNode.data+" ");
					if(currNode.left != null){
						q.add(currNode.left);
					}
					if(currNode.right != null){
						q.add(currNode.right);
					}
				}
			}
		}
		public static int getHeight(Node root){
			//Base Case
			if(root == null){
				return 0;
			}

			//Recursion
			int leftHeight = getHeight(root.left);
			int rightHeight = getHeight(root.right);
			
			//work
			return Math.max(leftHeight,rightHeight)+1;
		}

		public static int getNodes(Node root){
			if(root == null){
				return 0;
			}

			int lcount = getNodes(root.left);
			int rcount = getNodes(root.right);

			return (lcount + rcount)+ 1;
		}

		public static int sumOfNodes(Node root){
			if(root == null)
				return 0;
			int leftsum = sumOfNodes(root.left);
			int rightsum = sumOfNodes(root.right);
			
			return (leftsum + rightsum + root.data);
		}

		public static int getDiameter(Node root){
			if(root == null)
				return 0;
			
			int ldiam = getDiameter(root.left);
			int rdiam = getDiameter(root.right);
			
			int lheight = getHeight(root.left);
			int rheight = getHeight(root.right);
			
			int max = Math.max(ldiam,rdiam);
			int currdiam = lheight + rheight + 1;
			
			return Math.max(max,currdiam);
		}

		static class Info{
			int diameter;
			int height;
			
			public Info(int diameter,int height){
				this.diameter = diameter;
				this.height = height;
			}
		}
		
		public static Info getDiam(Node root){
			//Base Case
			if(root == null)
				return new Info(0,0);

			Info lInfo = getDiam(root.left);
			Info rInfo = getDiam(root.right);
			int currDiam = lInfo.height + rInfo.height + 1;
			int finalDiam = Math.max(lInfo.diameter,
						Math.max(rInfo.diameter,currDiam));
			int finalHeight = Math.max(lInfo.height,rInfo.height) + 1;

			return new Info(finalDiam,finalHeight);
		}
	}
	public static void main(String args[]){
		int tree[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTree bt = new BinaryTree();
		
		Node root = bt.buildTree(tree);
		bt.levelOrderTraversal(root);
		System.out.println("Height of Tree : "+bt.getHeight(root));
		System.out.println("Number of Node : "+bt.getNodes(root));
		System.out.println("Sum of Nodes Value : "+bt.sumOfNodes(root));
		System.out.println("Diameter : "+bt.getDiameter(root));
		System.out.println("Diameter : "+bt.getDiam(root).diameter);
	}
}