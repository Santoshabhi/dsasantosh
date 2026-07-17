class Solution {
    String map[]={"", "","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    List<String> ans =  new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0)
            return ans;
            backtrack(digits,0,new StringBuilder());
            return ans;
    }
    private void backtrack(String digits,int index,StringBuilder cur){
        if(digits.length()==index){
             ans.add(cur.toString());
             return;
        }
        String letters=map[digits.charAt(index) - '0'];
        for(char ch : letters.toCharArray()){
            cur.append(ch);
            backtrack(digits,index+1,cur);
            cur.deleteCharAt(cur.length()-1);



                    }


    }
}
