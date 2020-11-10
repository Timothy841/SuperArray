public class SuperArray{

  private String [] data;
  private int size;

  public SuperArray(){
    size = 0;
    data = new String[10];
  }

  public SuperArray(int initialCapacity){
    size = 0;
    if (initialCapacity < 0){
      throw new IllegalArgumentException("initialCapacity("+initialCapacity+") can not be negative");
    }
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
    while (index >= data.length){
      this.resize();
    }
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
    for (int i = 0; i<size;i++){
      if (data[i].equals(s)){
        return true;
      }
    }
    return false;
  }

  public void add(int index, String element){
    if (size>=data.length-1){
      this.resize();
    }
    for (int i = size; i >index; i--){
      data[i]=data[i-1];
    }
    data[index]=element;
    size++;
  }

  public String remove(int index){
    String a = data[index];
    if (size>0){
      for (int i = index; i < size-1; i++){
        data[i] = data[i+1 ];
      }
      data[size - 1] = null;
      size--;
    }
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

  public int lastIndexOf(String value){
    for (int i = size-1; i >= 0; i--){
      if (data[i].equals(value)){
        return i;
      }
    }
    return -1;
  }

  public String[] toArray(){
    String[] a = new String[size];
    for (int i = 0; i<size;i++){
      a[i]=data[i];
    }
    return a;
  }

  public boolean equals(SuperArray other){
    if (size==other.size){
      for (int i = 0; i<size;i++){
        if (!data[i].equals(other.data[i])){
          return false;
        }
      }
      return true;
    }
    return false;
  }
}
