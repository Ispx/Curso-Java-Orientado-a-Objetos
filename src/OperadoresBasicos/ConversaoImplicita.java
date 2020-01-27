package OperadoresBasicos;

public class ConversaoImplicita {
	public static void main(String[] args) {
	int numi = 10;
	double numd = 1.546456464546546d;
	float numf = 1.546456464546546f;
	String nums = "6548";
	
	int iconvertnumd, iconvertnumf, iconvertnums;
	double dconvertnumi, dconvertnumf, dconvertnums;
	float fconvertnumi, fconvertnumd, fconvertnums;
	String sconvertnumi, sconvertnumd, sconvertnumf;
	
	iconvertnumd = (int) numd;
	iconvertnumf = (int) numf;
	iconvertnums = Integer.parseInt(nums);
	
	dconvertnumi = (double) numi;
	dconvertnumf = (double) numf;
	dconvertnums = Double.parseDouble(nums);
	
	fconvertnumi = (float) numi;
	fconvertnumd = (float) numd;
	fconvertnums = Float.parseFloat(nums);
	
	sconvertnumi = " " + numi;
	sconvertnumd = " " + numd;
	sconvertnumf = " " + numf;
	
	System.out.println("Valor inteiro:" + numi);
	System.out.println("Valor double:" + numd);
	System.out.println("Valor float:" + numf);
	System.out.println("Valor string:" + nums);
	System.out.println();
	System.out.println("===========================");
	System.out.println("Conversão para inteiros: " + "\n" + iconvertnumd +"\n"+ iconvertnumf + "\n" + iconvertnums);
	System.out.println("Conversão para double: " + "\n" + dconvertnumi +"\n"+ dconvertnumf + "\n" + dconvertnums);
	System.out.println("Conversão para float: " + "\n" + fconvertnumi +"\n"+ fconvertnumd + "\n" + fconvertnums);
	System.out.println("Conversão para string: " + "\n" + sconvertnumi +"\n"+ sconvertnumd + "\n" + sconvertnumf);

	}
}