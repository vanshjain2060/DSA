class SegmetTree//SegmetTree for minimum ramge query
{
  int[] segval;
  public SegmetTree(int n)
  {
    segval = new int[4*n+1];
  }
  public void buildtree(int ind,int low,int high,int[] a)
  {
    if(low==high)
    {
      segval[ind] = a[low];
      return;
    }
    int mid = ((high-low)/2)+low;
    buildtree(2*ind+1,low,mid,a);
    buildtree(2*ind+2,mid+1,high,a);
    segval[ind] = Math.min(segval[2*ind+1],segval[2*ind+2]);
  }
  public int query(int ind,int low,int high,int l,int r)
  {
    if(high<l||r<low)
    return Integer.MAX_VALUE;
    if(low>=l&&high<=r)
    return segval[ind];
    int mid = ((high-low)/2)+low;
    int left = query(2*ind+1,low,mid,l,r), right = query(2*ind+2,mid+1,high,l,r);
    return Math.min(left,right);
  }
  public void update(int ind,int low,int high,int indc,int value)
  {
    if(low==high)
    {
      segval[ind] = value;
      return;
    }
    int mid = ((high-low)/2)+low;
    if(indc<=mid)
    update(2*ind+1,low,mid,indc,value);
    else
    update(2*ind+2,mid+1,high,indc,value);
    segval[ind] = Math.min(segval[2*ind+1],segval[2*ind+2]);
  }
}