public class rep{
public static void main(String args[]){
int ar[]={1,1,1,3,2,2};
for(int i=0;i<ar.length;i++){
int c=0;
for(int j=0;j<ar.length;j++){
if(ar[i]==ar[j])
c++;}
if(c==1)
System.out.println(ar[i]);
}
}
}
