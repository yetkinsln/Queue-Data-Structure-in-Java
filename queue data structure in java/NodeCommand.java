public class NodeCommand<T> {
    
     Node<T> head=null;
    Node<T> tail;
     Node<T> dnode;
     int size;
     
     public void createNode(T value){
         Node<T> nnode = new Node<>();
    if(head==null){
        head = nnode;
        nnode.prev = null;
        nnode.value = value;
        size++;
    }else{
        dnode = head;
        while(dnode.next!=null){
            dnode = dnode.next;
        }
        dnode.next = nnode;
        nnode.prev = dnode;
        nnode.value = value;
        size++;
    }    
     }
     public void printAll(){
         dnode =  head;
         while(dnode.next != null){
             System.out.println(dnode.value);
             dnode = dnode.next;
         }
         System.out.println(dnode.value);
     }
     
     public void addFirst(T value){
         if(head==null){
                    Node<T> nnode = new Node<>();
                    head = nnode;
                    head.prev = null;
                    head.value = value;
                    size++;
         }else{
              Node<T> nnode = new Node<>();
              head.prev = nnode;
              nnode.next = head;
              head = nnode;
              nnode.value = value;
              size++;
         }
     }
      public void deleteNode(T value){
           Node<T> nnode = new Node<>();
           nnode = head;
           while(nnode!= null){
               if(nnode.value.equals(value)){
                   if(nnode.prev == null){
                       nnode.next.prev = null;
                       head = nnode.next;
                       break;
                   }else if(nnode.next == null){
                       nnode.prev.next = null;
                       break;
                   }else{
                   nnode.next.prev = nnode.prev;
                   nnode.prev.next = nnode.next;
                   break;
                   }
               
                   
               }
               nnode = nnode.next;
           }
     }
     public void deleteNode(int index){
       if(index>size){
           throw new ArrayIndexOutOfBoundsException("Declared index does not exist");
       }else if(index==0){
           head.next.prev=null;
           head = head.next;
       }else if(index == size-1){
           Node<T> nnode = new Node<>();
                         nnode = head;
                         int i=0;
                        while(i<size-1){
                            nnode=nnode.next;
                            i++;
                        }nnode.prev.next = null;
       }else{
           int i=0;
                         Node<T> nnode = new Node<>();
                         nnode = head;
           while(i !=index){
           nnode = nnode.next;
           i++;
       }
           nnode.prev.next = nnode.next;
           nnode.next.prev = nnode.prev;
           
       }
     }
     public Node<T> getNode(int index){
         Node<T> nnode = new Node<>();
         nnode = head;
         int i =0;
         if(index>=size){
           throw new ArrayIndexOutOfBoundsException("Declared index does not exist");
       }
         while(i<index){
             nnode = nnode.next;
             i++;
         }
         return nnode;
     }
      
}
