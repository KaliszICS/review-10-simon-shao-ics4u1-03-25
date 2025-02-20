public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(square(1));
	}
public static String pyramid(int layer){
	String word = "";
	int count=0;
	boolean construct = true;
for (int j = 0; j<layer;j++){
	for (int i=0; i<layer-j-1;i++){
	word+=" ";
	}
	count =0;
		construct=true;
while (count<j+1){

	if (construct){
	word+="*";
count++;
construct =false;
	}
	else{
		word+=" ";
		construct = true;
	}
}
if (j<layer-1){
word+="\n";
}

}
return word;
}


public static String square(int num){
	int width =0;
	String square = "";
	while (width<num){
		if (width == num-1){
			for (int i = 0; i<num;i++){
				square+="*";
							}
						width+=1;
		}
		else if (width == 0){
			for (int i = 0; i<num;i++){
square+="*";
			}
		width+=1;
square+="\n";
		}
		else{
			square+="*";
			for (int j=0; j<num-2;j++){
				square+=" ";
			}
			square+="*\n";
			width+=1;
		}
	}
	return square;
}


public static boolean hasLowercase(String word){
	boolean has = false;
for (int i=0; i<word.length(); i++){
	if (word.charAt(i)<=122){
		if (word.charAt(i)>=97){
		has = true;
	}
}
}
	return has;
}
}

