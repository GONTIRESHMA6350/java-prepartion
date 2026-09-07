bool prime(int n)
{
if(n<=1) return false;
int i=2;
while(i*i <=n)
if(n % i == 0)
return false;
i++;
}
return true;
}


public class prinum
{
    public static void main(String[] args)
    {
      prime obj = new prime();
      bool r=obj.prime(98);
}
}
