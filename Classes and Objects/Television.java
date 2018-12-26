package javaAssignments;

public class Television {
		boolean state;
		int volume=0;
		private int channel;
		
		public Television(boolean state, int channel) {
			this.state = state;
			this.channel = channel;
		}
		public Television() {
		}
		public boolean checkState(){
			return state;
		}
		public int increaseVolume(){
			if(state==true && volume>=0){
				volume=volume+1;
			}
			return volume;
		}
		public int decreaseVolume(){
			if( state==true && volume>0 ){
			volume=volume-1;
			
			}
			return volume;
		}
		public int currentChannel(){
			if(state==true){
				return channel;
			}
			return channel;
		}
		public int changeChannel(){
			if(state==true){
				channel= channel+1;
			}
			return channel;
		}
		public boolean changeState(){
			if(state==true){
				state=false;
			}
			return state;
		}
	}