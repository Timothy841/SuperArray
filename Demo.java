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
    removeDuplicates(a);
    removeDuplicates(b);
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

  public static SuperArray zip(SuperArray a, SuperArray b){
    int c = Math.min(a.size(),b.size());
    SuperArray d = new SuperArray();
    for (int i = 0; i< c; i++){
      d.add(a.toArray()[i]);
      d.add(b.toArray()[i]);
    }
    if (c ==a.size()){
      for (int i = c; i< b.size(); i++){
        d.add(b.toArray()[i]);
      }
    }
    else{
      for (int i = c; i< a.size(); i++){
        d.add(a.toArray()[i]);
      }
    }
    return d;
  }

  public static void main(String[]args){
    SuperArray words = new SuperArray();
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);
    SuperArray a = new SuperArray();
    SuperArray b = new SuperArray();
    a.add("9");
    a.add("1");
    a.add("2");
    a.add("2");
    a.add("3");
    a.add("4");
    b.add("0");
    b.add("4");
    b.add("2");
    b.add("2");
    b.add("2");
    b.add("2");
    b.add("9");
    b.add("2");
    b.add("9");
    b.add("2");
    b.add("9");
    System.out.println(a.toString());
    System.out.println(b.toString());
    System.out.println(zip(a,b).toString());
    System.out.println(findOverlap(a,b));
    a.clear();
    b.clear();
    a.add("9");
    a.add("1");
    a.add("2");
    b.add("9");
    b.add("1");
    b.add("2");
    b.add("");
    System.out.println(a.equals(b));
  }
}
