class Solution {

    public String encode(List<String> strs) {
            StringBuffer s= new StringBuffer();
            for(String s1:strs){
                s.append(s1.length());
                s.append("#");
                s.append(s1);
            }
            String res=s.toString();
           
            return res;
    }

    public List<String> decode(String str) {
        List<String> lst=new ArrayList<>();
        System.out.println(str);
        for(int i=0;i<str.length();i++){
            StringBuffer num=new StringBuffer();
            StringBuffer word=new StringBuffer();
            while(str.charAt(i)>='0' && str.charAt(i)<='9'){
                num.append(str.charAt(i));
                i++;
            }
            if(str.charAt(i)=='#'){
                i++;
                System.out.println("num: "+num.toString());
                int count=Integer.parseInt(num.toString());
                int itr=i+count;
                System.out.println("id- :"+i+" "+itr);
                for(;i<itr;i++){
                    word.append(str.charAt(i));
                }
                i--;
                lst.add(word.toString());
            }
        }
        return lst;
    }
}
