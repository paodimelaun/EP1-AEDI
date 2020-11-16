public class PilhaDinamicaDobra implements Estruturas {
    protected int capacity ;
    public static final int CAPACITY = 8;
    protected Integer[] pilha;
    protected int size;
    
    public PilhaDinamicaDobra(){
    capacity = CAPACITY;
    pilha = new Integer[capacity];
    size = 0;
    }
    
    public void add (int newElement){
    if(size==capacity){
        //só mudei +8 por *2
    capacity=capacity*2;
    Integer[] tmp = new Integer[capacity];
    for (int j=0;j<size;j++)
    tmp[j]=pilha[j];
    pilha=tmp;
    }
    pilha[size]=newElement;
    size++;
    }
    public int remove (){
    int tmp = pilha[size-1];
    size--;
    return tmp;
    }
    public String formated(){
        
        String format="";
        for(int i=0;i<=size-1;i++){
            format=format+pilha[i]+"\n";
        }
        return format;
    }
    }