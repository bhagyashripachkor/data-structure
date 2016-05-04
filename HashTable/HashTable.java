class HashTable
{
    private SLLNode[] table;
    private int size ;
 
    public HashTable(int tableSize)
    {
      
        table = new SLLNode[ nextPrime(tableSize) ];
        size = 0;
    }
   
    public boolean isEmpty()
    {
        return size == 0;
    }
    
    
    public int getSize()
    {
        return size;
    }
    
    public void insert(int val)
    {
        Integer intObj = new Integer(val);
        size++;
        int pos = myhash(intObj);        
        SLLNode node = new SLLNode(val);                
        if (table[pos] == null)
            table[pos] = node;            
        else
        {
            node.next = table[pos];
            table[pos] = node;
        }    
    }
    
    private int myhash(Integer x )
    {
        int hashVal = x.hashCode( );
        hashVal = hashVal % table.length;
        if (hashVal < 0)
            hashVal = hashVal + table.length;
        return hashVal;
    }
    //generate next prime number >= n 
    private static int nextPrime( int num )
    {
        if (num % 2 == 0)
            num++;
        for ( ; !isPrime( num ); num = num + 2);
 
        return num;
    }
  
    private static boolean isPrime( int num )
    {
        if (num == 2 || num == 3)
            return true;
        if (num == 1 || num % 2 == 0)
            return false;
        for (int i = 3; i * i <= num; i = i + 2)
            if (num % i == 0)
                return false;
        return true;
    }
    public void printHashTable ()
    {
        System.out.println();
        for (int i = 0; i < table.length; i++)
        {
            System.out.print ("[" + i + "]" + "->");             
            SLLNode start = table[i];
            while(start != null)
            {
                System.out.print(start.data +" ");
                start = start.next;
            }
            System.out.println();
        }
    }   
}
