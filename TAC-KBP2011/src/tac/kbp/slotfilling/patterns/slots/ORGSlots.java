package tac.kbp.slotfilling.patterns.slots;

import java.util.HashMap;
import java.util.LinkedList;

public class ORGSlots {
	
	public static HashMap<String, LinkedList<String>> slots_patterns = new HashMap<String, LinkedList<String>>();
	
	public static void load_patterns() {
		
		/* org:alternate_names*/		
		LinkedList<String> patterns = new LinkedList<String>();
		ORGSlots.slots_patterns.put("org:alternate_names", patterns);
		
		/* org:political_religious_affiliation */
		patterns = new LinkedList<String>();
		ORGSlots.slots_patterns.put("org:political_religious_affiliation", patterns);
		
		
		/* org:top_members_employees */
		patterns = new LinkedList<String>();
		patterns.add("heads the");
		patterns.add("secretary general");
		patterns.add("vice president of");
		patterns.add("leader of");
		patterns.add("director of");
		patterns.add("general of");
		patterns.add("chairman of");
		patterns.add("chief of");
		patterns.add("chief executive of");
		patterns.add("archbishop of");
		patterns.add("president of");
		patterns.add("manager of");
		patterns.add("chief commissioner of");
		patterns.add("head of");
		patterns.add("president for");
		patterns.add("managing director");
		patterns.add("chief executive");
		ORGSlots.slots_patterns.put("org:top_members_employees", patterns);
		
		
		/* org:number_of_employees_members */
		patterns = new LinkedList<String>();
		patterns.add("employs");
		ORGSlots.slots_patterns.put("org:number_of_employees_members", patterns);
		
		
		/* org:members */
		patterns = new LinkedList<String>();		
		patterns.add("the parent of");
		patterns.add("owns");
		patterns.add("acquired by");
		ORGSlots.slots_patterns.put("org:members", patterns);
		
		
		/* org:member_of */
		patterns = new LinkedList<String>();		
		patterns.add("representative of");
		patterns.add("comprises of");
		patterns.add("the parent of");
		patterns.add("owns");
		patterns.add("acquired by");
		ORGSlots.slots_patterns.put("org:member_of", patterns);
		
		
		/* org:subsidiaries */
		patterns = new LinkedList<String>();
		patterns.add("launched");
		patterns.add(".*a subsidiary of.*");
		patterns.add("runs outlets");
		patterns.add("has outlets");
		patterns.add("was run by");
		patterns.add("is run by");
		patterns.add("completed a boyout of");
		patterns.add("bought");
		patterns.add("operates");
		ORGSlots.slots_patterns.put("org:subsidiaries", patterns);
		

		/* org:parents */
		patterns = new LinkedList<String>();
		patterns.add("takeover bid for");
		patterns.add("subsidiary of");
		patterns.add("joint venture of");
		patterns.add("former parent company");
		patterns.add("new parent company");
		patterns.add("parent company");		
		ORGSlots.slots_patterns.put("org:parents", patterns);
		
		
		/* org:founded_by */
		patterns = new LinkedList<String>();
		patterns.add("founder");
		patterns.add("established in");
		patterns.add("created");
		patterns.add("founded by");
		patterns.add("founded the");
		patterns.add("founder");
		patterns.add("set up by");
		ORGSlots.slots_patterns.put("org:founded_by", patterns);
		
		/* org:founded */
		patterns = new LinkedList<String>();
		patterns.add("founded in");
		patterns.add("fouding in");
		patterns.add("created in");
		patterns.add("dates to");
		patterns.add("a company launched in");
		patterns.add("established in");
		patterns.add("started its operations in");
		patterns.add("league started in");
		patterns.add("opened its doors");
		patterns.add("since its inception in");		
		ORGSlots.slots_patterns.put("org:founded", patterns);

		
		/* org:dissolved */ 
		patterns = new LinkedList<String>();
		patterns.add("was dissolved");
		patterns.add("merged with");
		patterns.add("closed down");
		ORGSlots.slots_patterns.put("org:dissolved", patterns);

		
		/* org:place_of_headquarters */
		patterns = new LinkedList<String>();
		patterns.add("base in");
		patterns.add("based in");
		patterns.add("headquarters in");
		patterns.add("established in");
		patterns.add("has executive offices in");
		ORGSlots.slots_patterns.put("org:place_of_headquarters", patterns);
		
		
		/* org:shareholders */
		patterns = new LinkedList<String>();
		patterns.add("majority owner of");
		patterns.add("shares of");
		patterns.add("initial investment");
		patterns.add("increases stake in");
		patterns.add("has stakes");
		patterns.add("holds stakes");
		//patterns.add("holds % stakes");
		//patterns.add("acquired % stakes");
		//patterns.add("owns % stakes");
		patterns.add("purchased");
		patterns.add("bought");
		patterns.add("increases shares");
		patterns.add("has shares");
		patterns.add("holds shares");
		//patterns.add("holds % shares");
		//patterns.add("acquired % shares");
		//patterns.add("owns % shares");
		//patterns.add("purchased % shares");
		//patterns.add("bought % shares");
		patterns.add("capital investment");
		patterns.add("cash infusion");
		//patterns.add("offered % share");				
		ORGSlots.slots_patterns.put("org:shareholders", patterns);
		
		/* org:website */
		patterns = new LinkedList<String>();
		ORGSlots.slots_patterns.put("org:website", patterns);
		
		
		
	}
}