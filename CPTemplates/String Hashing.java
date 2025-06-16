class Hashing 
{
  private String s;
  private int n;
  private int primes;
  private long base = 31;
  private List<Long> hashPrimes = Arrays.asList(1000000009L,100000007L);
  private List<long[]> hashValues;
  private List<long[]> powersOfBase;
  private List<long[]> inversePowersOfBase;
  
  public Hashing(String a) 
  {
    this.s = a;
    this.n = s.length();
    this.primes = hashPrimes.size();
    hashValues = new ArrayList<>(primes);
    powersOfBase = new ArrayList<>(primes);
    inversePowersOfBase = new ArrayList<>(primes);
    
    for(int i=0;i<primes;i++) 
    {
      long prime = hashPrimes.get(i);
      long[] power = new long[n+1];
      long[] inversePower = new long[n+1];
      power[0] = 1;
      
      for(int j=1;j<=n;j++) 
      power[j] = (power[j-1]*base)%prime;
      
      inversePower[n] = modInverse(power[n],prime);      
           
      for(int j=n-1;j>=0;j--) 
      inversePower[j] = modMul(inversePower[j+1],base,prime);
      
      powersOfBase.add(power);
      inversePowersOfBase.add(inversePower);
    }
    for(int i=0;i<primes;i++) 
    {
      long prime = hashPrimes.get(i);
      long[] hash = new long[n];     
      for(int j=0;j<n;j++) 
      {
        hash[j] = ((s.charAt(j)-'a'+1L)*powersOfBase.get(i)[j])%prime;
        if(j>0) 
        hash[j] = (hash[j] +hash[j-1])%prime;       
      }
      hashValues.add(hash);
    }
  }

  public List<Long> substringHash(int l,int r) 
  {
    List<Long> hashList = new ArrayList<>(primes);
    for(int i=0;i<primes;i++) 
    {
      long prime = hashPrimes.get(i);
      long val1 = hashValues.get(i)[r];
      long val2 = (l>0) ? hashValues.get(i)[l-1] : 0;
      long hash = modMul(modSub(val1,val2,prime),inversePowersOfBase.get(i)[l],prime);
      hashList.add(hash);
    }
    return hashList;
  }

  private long modMul(long a,long b,long mod) 
  {
    return (a*b)%mod;
  }

  private long modSub(long a,long b,long mod) 
  {
    return (a-b+mod)%mod;
  }

  private long modInverse(long a,long mod) 
  {
    return power(a,mod-2,mod);
  }

  private long power(long x,long y,long p) 
  {
    long res = 1;
    x = x % p;
    while(y>0) 
    {
      if((y&1)==1) 
      res = (res*x)%p;
      y >>= 1;
      x = (x*x)%p;
    }
    return res;
  }
}