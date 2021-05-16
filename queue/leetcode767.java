class Solution {
    public String reorganizeString(String s) {
    int charcount[]=new int [26];
        
        for(int i=0;i<s.length();i++){
            charcount[s.charAt(i)-'a']++;
        }
        
        PriorityQueue<Point> pq=new PriorityQueue<Point>(new mycomparator());
        
        for(int i=0;i<26;i++){
            if(charcount[i]!=0){
                pq.add(new Point((char)(i+'a'),charcount[i]));
            }
        }
        String ss="";
        int i=0;
        while(pq.isEmpty()!=true){
            Point p=pq.poll();
            if(ss.length()!=0 && ss.charAt(ss.length()-1)==p.a && !pq.isEmpty()){
                Point q=pq.poll();
            
                pq.add(p);
                ss=ss+q.a;
                q.count--;
                if(q.count>0)
                pq.add(q);
            }
            else if(ss.length()!=0 && pq.isEmpty() &&ss.charAt(ss.length()-1)==p.a ){
                return  "";
            }
            else{
            ss=ss+p.a;
                p.count--;
                
                if(p.count>0)
                pq.add(p);
            }
            
            
            
        }
        
        return ss;
    
}
}

class Point{
    char a;
    int count;
    
    public Point(char a,int count){
        this.a=a;
        this.count=count;
    }
}

class mycomparator implements Comparator<Point>{
    public int compare(Point p1,Point p2){
        return p2.count-p1.count;
    }
}
/*

class Solution {
public String reorganizeString(String s) {
if(s.length() == 1) return s;
int[] freq = new int[26];
int max=1, maxLetter=0;
for(char ch:s.toCharArray()){
freq[ch-'a']++;
if(freq[ch-'a'] > max){
max = freq[ch-'a'];
maxLetter = ch-'a';
}
}
if(max > (s.length()+1)/2){
return "";
}
char res[] = new char[s.length()];
int index=0;
while(freq[maxLetter]-- > 0){
res[index] = (char)('a'+maxLetter);
index = index +2;
}
for(int i=0;i<freq.length;i++){
while(freq[i]-- > 0){
if(index >= s.length()){
index=1;
}
res[index] = (char)('a' + i);
index = index +2;
}
}
return new String(res);
}
}
*/
