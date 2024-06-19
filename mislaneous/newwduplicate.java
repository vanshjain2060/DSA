package Vansh.mislaneous;
 class newwduplicate{
    
   public static int remove_duplicate(int A[],int N){
        int count=0;
        for(int i=0; i<N; i++) {
            for(int j=i+1; j<N; j++) {
                if(A[i]==A[j]) {
                    continue;
                }count++;
            }
        }
      return N-count;  
    }

    static void remove(String str ,int i ,StringBuilder newstr ,boolean map[]){
        //base case
        if(i == str.length()){
            System.out.println(newstr);
            return;
        }
        //kaam
        char currChar = str.charAt(i);
        if(map[currChar-'a'] == true){  // then this is the condition of duplicate
            remove(str, i+1, newstr, map);
        }else{
            map[currChar - 'a'] = true;
            remove(str, i, newstr.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String str="vanshjain";
        remove(str, 0, new StringBuilder(""), new boolean[26]);
    }


}
