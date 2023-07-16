package createownmap;

import java.util.ArrayList;

public class Map<k, v> {
	
	ArrayList<MapNode<k,v>> buckets;
	
	int numBucket;
	public Map() {
		ArrayList<MapNode<k,v>> buckets = new ArrayList<>();
		numBucket = 20;
		for(int i=0; i<numBucket; i++) {
			buckets.add(null);
		}
	}
	
	

}
