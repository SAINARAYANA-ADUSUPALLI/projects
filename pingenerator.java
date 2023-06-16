class pingenerator{
	public static int getpin(int input1,int input2,int input3){
		int pin =0;

		int pos1 = Integer.parseInt(String.valueOf(String.valueOf(input1).charAt(2)));
		int pos2 = Integer.parseInt(String.valueOf(String.valueOf(input2).charAt(2)));
		int pos3 = Integer.parseInt(String.valueOf(String.valueOf(input3).charAt(3)));

		if(pos1 < pos2 && pos1 <pos3){
			pin = pos1;
		} 
		else if(pos2<pos3){
			pin = pos2;
		}
		else{
			pin = pos3;
		}
		pos1 = Integer.parseInt(String.valueOf(String.valueOf(input1).charAt(1)));		
		pos2 = Integer.parseInt(String.valueOf(String.valueOf(input2).charAt(1)));		
		pos3 = Integer.parseInt(String.valueOf(String.valueOf(input3).charAt(1)));		

		if(pos1 <pos2 && pos1 < pos3){
			pin = pos1 * 10 +pin;
		}
		else if(pos2<pos3){
			pin = pos2 * 10 + pin;
		}
		else{
			pin = pos3 * 10 + pin;
		}
		pos1 = Integer.parseInt(String.valueOf(String.valueOf(input1).charAt(0)));		
		pos2 = Integer.parseInt(String.valueOf(String.valueOf(input2).charAt(0)));		
		pos3 = Integer.parseInt(String.valueOf(String.valueOf(input3).charAt(0)));			

		if(pos1 < pos2 && pos1 < pos3){
			pin = pos1 * 100 + pin;
		}
		else if(pos2< pos3){
			pin = pos2 * 100 + pin;
		}	
		else{
			pin = pos3 * 100 + pin;
		}

		int maxof = 0;
		for(int i = 0;i<3;i++){
		pos1 = Integer.parseInt(String.valueOf(String.valueOf(input1).charAt(i)));		
		pos2 = Integer.parseInt(String.valueOf(String.valueOf(input2).charAt(i)));		
		pos3 = Integer.parseInt(String.valueOf(String.valueOf(input3).charAt(i)));			
			
		if(pos1 < pos2 && pos1 < pos3){
			maxof = pos1 > maxof ? pos1 : maxof;
		}
		else if(pos2< pos3){
			maxof = pos2 > maxof ? pos2 : maxof;
		}	
		else{
			maxof = pos3 > maxof ? pos3 : maxof;
		}		 
		}
		pin = maxof * 1000 + pin;
		return pin;
	}
	public static void main(String[] args){
		System.out.println(getpin(123,456,789));
	}	
}