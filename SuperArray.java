public class SuperArray{

  private String [] data;
  private int size;

  public SuperArray(){
    size = 0;
    data = new String[10];
  }

  public SuperArray(int initialCapacity){
    size = 0;
    data = new String[initialCapacity];
  }

  public int size(){
    return size;
  }

  public boolean add(String element){
    if (size == data.length){
      this.resize();
    }
    data[size]=element;
    size++;
    return true;
  }

  public String get(int index){
    return data[index];
  }

  public String set(int index, String element){
    String a = data[index];
    data[index] = element;
    return a;
  }

  private void resize(){
    SuperArray sp = new SuperArray();
    sp.data = new String[data.length*2+1];
    for (int i = 0; i < size; i++){
      sp.data[i] = data[i];
    }
    data = sp.data;
  }

  public boolean isEmpty(){
    if (size == 0){
      return true;
    }
    return false;
  }

  public void clear(){
    data = new String[data.length];
    size = 0;
  }

  public String toString(){
    String a = "[";
    for (int i = 0; i<size;i++){
      if (i<size-1){
        a+=data[i]+", ";
      }
      else{
        a+=data[i];
      }
    }
    a+="]";
    return a;
  }

  public boolean contains(String s){
    for (int i = 0; i<size && data[i].equals(s);i++){
      return true;
    }
    return false;
  }

  public void add(int index, String element){
    if (size==data.length){
      this.resize();
    }
    for (int i = size; i >=index; i--){
      data[i]=data[i-1];
    }
    data[index]=element;
    size++;
  }

  public String remove(int index){
    String a = data[index];
    for (int i = index; i <size; i++){
      data[i]=data[i+1];
    }
    size--;
    return a;
  }

  public int indexOf(String s){
    for (int i = 0; i<size; i++){
      if (data[i].equals(s)){
        return i;
      }
    }
    return -1;
  }
}
