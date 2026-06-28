class DigitDelay{
	public static void main(String args[])throws Exception{
		String num=args[0];
		for(int i=0;i<num.length();i++){
			System.out.println(num.charAt(i));
			Thread.sleep(2000);
		}
	}
}

