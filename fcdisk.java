public class fcdisk
{
public static void main(String args[])
{
int head=53;
int a[]={98,183,37,122,14,124,65,67};
int i,j,r=0,n;
n=a.length;

if(a[0]>head)
{ r=a[0]-head; }
else
{ r=head-a[0]; }

for(i=1;i<n;i++)
{

if(a[i-1]>a[i])
{  r=r+( a[i-1]-a[i]);  }
else
{ r=r+ (a[i]-a[i-1]);  }
}

System.out.print(r);
}
}
