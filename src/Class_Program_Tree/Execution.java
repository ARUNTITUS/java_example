

	
	package Class_Program_Tree;

	public class Execution {
	    public static void main(String[] args) {

	        Example tree = new Example();
	        tree.insertAll();

	        // tree.PreOrder(tree.ob);
	        // Traversal t = new Traversal(tree.ob);
	        tree.inOrder(tree.ob);
	        System.out.println("-------------------");
	        System.out.println("Post");
	        tree.PostOrder(tree.ob);
	        System.out.println("Pre");
	        tree.PreOrder(tree.ob);
	        
	        System.out.println("The height of the tree is");
	        System.out.println(tree.height(tree.ob));
	    }
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
