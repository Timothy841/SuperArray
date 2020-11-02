public class SuperArray{

  private String [] data;
  private int size;

  public SuperArray(){
    size = 0;
    data = new String[10];
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
    sp.data = new String[data.length + 10];
    for (int i = 0; i < size; i++){
      sp.data[i] = data[i];
    }
    data = sp.data;
  }
}
