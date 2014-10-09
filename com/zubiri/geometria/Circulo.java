package com.zubiri.geometria;
public class Circulo{

private float area;
private float circunferencia;
private float radio;

	public void setRadio (float radio) 
	 {
         this.radio = radio;
        }
	public void setArea (float radio)
	{
	this.area = 3.1416f * (radio * radio);
         }
	public void setCircunferencia (float radio)
	{
	this.circunferencia = 2 * 3.1416f * radio;
        }

	
public float getArea()
{
return area;
}

public float getCircunferencia()
{
return circunferencia;
}

}
