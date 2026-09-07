class Helper
{
int mindigit(int n)
{
int ans = 10;
while(n>0)
{
int last = n%10;
if(mindigit>last)
{
mindigit=last
}
return mindigit;
}


//mindigit=math.min(mindigit,last);

int maxdigit(int n)
{
int ans= 0;
while(n>0)
{
int last = n%10;
if(maxdigit<last)
{
maxdigit= last;
}
return maxdigit;
}
//ans = math.max(ans,last);
n=n/10;

int minmaxpro(int n){
int m1=mindigit(n);
int m2=maxdigit(n);
return m1*m2;
}
}
