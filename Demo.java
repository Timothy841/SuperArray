public class Demo{

  public static void removeDuplicates(SuperArray s){
    for (int i = 0; i<s.size();i++){
      if (i!=s.indexOf(s.toArray()[i])){
        s.remove(i);
        i--;
      }
    }
  }

  public static SuperArray findOverlap(SuperArray a, SuperArray b){
    SuperArray c = new SuperArray();
    for (int i = 0; i<a.size();i++){
      for (int j = 0;j<b.size();j++){
        if (a.toArray()[i].equals(b.toArray()[j])){
          c.add(a.toArray()[i]);
        }
      }
    }
    return c;
  }

  public static void main(String[]args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);
    SuperArray a = new SuperArray();
    SuperArray b = new SuperArray();
    a.add("0");
    a.add("2");
    a.add("1");
    a.add("3");
    a.add("4");
    a.add("5");
    a.add("6");
    a.add("7");
    a.add("8");
    b.add("4");
    b.add("6");
    b.add("2");
    b.add("9");
    b.add("5");
    b.add("1");
    b.add("0");
    System.out.println(a.toString());
    System.out.println(b.toString());
    System.out.println(findOverlap(a,b));
  }
}
