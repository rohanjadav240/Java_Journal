class VC{
	public static void main(String args[]){
		String str = args[0].toLowerCase();
		int V=0;
		int C=0;
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if('a'<=ch && ch<='z'){
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
					V++;
				}
				else{
					C++;
				}
			}
		}
		System.out.println("Vowels = "+V);
		System.out.println("Consonants = "+C);
	}
}