package javapractise;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class VowelsReverse {
	
	
	public void methods(String name) {
		
		
			
				char[] chr=name.toCharArray();
				int legofvol=chr.length;
				String reverse="";
				
				for(int j=legofvol-1;j>=0;j--) {
                 if(chr[j]=='a' & chr[j]=='e' & chr[j]=='i' & chr[j]=='o' & chr[j]=='u'  )
					reverse=reverse+chr[j];
				}
				System.out.print(reverse);
				
			
			
		}
		
	
	public static void main(String[] args) {
	
		
		VowelsReverse concepts=new VowelsReverse();
		concepts.methods("aeiou");
		
		
		
		
	}

}
