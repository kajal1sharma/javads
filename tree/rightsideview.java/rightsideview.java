class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list=new ArrayList<Integer>();
        if(root==null){
            return list;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            int n=q.size();
            
            for(int i=0;i<n;i++){
                TreeNode temp= q.poll();
                
                if(i==0){
                    list.add(temp.val);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
                if(temp.left!=null){
                    q.add(temp.left);
                }
            }
        }
        return list;
    }
}