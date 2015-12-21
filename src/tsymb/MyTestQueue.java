package tsymb;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class Command{
	private String cmd;
	Command(String cmd){
		this.cmd = cmd; 
	}
	
	String getCmd (){
		return cmd;
	}
	void setCmd(String cmd){
		this.cmd = cmd;
	}
	
	void operate(){
		System.out.println("Executing "+cmd);
	}
}

class GenerateCommandQueue{
	static Queue<Command> getCommandQueue(){
		Queue<Command> queue = new LinkedList<Command>();
		
		queue.add(new Command("cd"));
		queue.add(new Command("dir"));
		queue.add(new Command("rm"));
		queue.add(new Command("ls"));
		queue.add(new Command("more"));
		queue.add(new Command("format c: /autotest"));
		
		return queue;
	}
}

class ProcessCommandQueue{
	static void process(Queue<Command> cmdQueue){
		Iterator<Command> iterator = cmdQueue.iterator();
		while (iterator.hasNext())
			iterator.next().operate();
	}
}

public class MyTestQueue {

	public static void main(String[] args) {
		ProcessCommandQueue.process(GenerateCommandQueue.getCommandQueue());
	}

}
