class term{
  private String name;
  private double value;
  private double g[] = new double[1];

  public term(String n, double v){
    name = n;
    value = v;
  }
  public addGrade(double v){
    int gl = g.length+1;
    double newG[] = new double[gl]
    for(i=0;i<gl-2;i++){
      newG[i] = g[i];
    }
    g = newG;
    g[gl-1] = v;
  }
  public static void main(String[] args) {

  }
}
