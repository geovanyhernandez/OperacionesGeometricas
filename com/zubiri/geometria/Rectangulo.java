package com.zubiri.geometria;
public class Rectangulo {

private double base;
private double altura;
private double perimetro;
private double superficie;

  public void setBase(double base)
  {
this.base = base; 
  }

  public void setAltura (double altura)
  {
this.altura = altura;
  }

  public double  getbase()
  {
return base;
  }

  public double  getaltura()
  {
return altura;
  }

public double perimetro() {
perimetro = (2*base) + (2*altura);
return perimetro;
 }
public double superficie() {
superficie = base * altura;
return superficie; 
 }
}
 
