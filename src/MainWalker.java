import org.osbot.rs07.api.map.Area;
import org.osbot.rs07.api.map.Position;
import org.osbot.rs07.script.Script;
import org.osbot.rs07.script.ScriptManifest;

import java.util.concurrent.TimeUnit;
import java.awt.*;

@ScriptManifest(name = "Lumby To GE", author = "dokato", version = 1.0, info = "", logo = "") 
public class MainWalker extends Script {
	
	private boolean startb = true;

    private long timeRan;
    private long timeBegan;
	private long timeBotted;
	private long timeOffline;
	private String status;
	
	@Override
    public void onStart(){
		
    }
	
    public int onLoop() throws InterruptedException{
    	goToGE();
    	return 0;
    }

    @Override
    public void onPaint(Graphics2D g1){
    	
    	if(this.startb){
    		this.startb=false;
    		this.timeBegan=System.currentTimeMillis();
    	}
    	this.timeRan = (System.currentTimeMillis() - this.timeBegan);
		if (getClient().isLoggedIn()) {
			this.timeBotted = (this.timeRan - this.timeOffline);
		} else {
			this.timeOffline = (this.timeRan - this.timeBotted);
		}
		
		Graphics2D g = g1;

		g.setFont(new Font("Arial", 0, 13));
		g.setColor(new Color(255, 255, 255));
		g.drawString("Version: " + getVersion(), 20, 170);
		g.drawString("Runtime: " + ft(this.timeRan), 20, 185);
		g.drawString("Time botted: " + ft(this.timeBotted), 20, 200);
		g.drawString("Status: " + status, 20, 215);
    }
    
    private void goToGE(){
    	status="going to the ge";
    	if(getMap().canReach(new Position(3165,3486,0))){
    		getWalking().walk(new Area(3165,3486,3163,3484));
    	}
    	else if(getMap().canReach(new Position(3165,3478,0)))
    		getWalking().walk(new Area(3165,3478,3163,3476));
    	else if(getMap().canReach(new Position(3165,3469,0)))
    		getWalking().walk(new Area(3164,3466,3165,3469));
    	else if(getMap().canReach(new Position(3172,3460,0)))
    		getWalking().walk(new Area(3172,3460,3174,3457));
    	else if(getMap().canReach(new Position(3180,3455,0)))
    		getWalking().walk(new Area(3182,3453,3180,3455));
    	else if(getMap().canReach(new Position(3191,3488,0)))
    		getWalking().walk(new Area(3191,3488,3193,3446));
    	else if(getMap().canReach(new Position(3196,3442,0)))
    		getWalking().walk(new Area(3196,3442,3199,3440));
    	else if(getMap().canReach(new Position(3199,3434,0)))
    		getWalking().walk(new Area(3199,3434,3198,3431));
    	else if(getMap().canReach(new Position(3207,3428,0)))
    		getWalking().walk(new Area(3209,3426,3207,3428));
    	else if(getMap().canReach(new Position(3211,3418,0)))
    		getWalking().walk(new Area(3211,3418,3210,3415));
    	else if(getMap().canReach(new Position(3210,3408,0)))
    		getWalking().walk(new Area(3210,3408,3212,3405));
    	else if(getMap().canReach(new Position(3212,3398,0)))
    		getWalking().walk(new Area(3212,3398,3211,3395));
    	else if(getMap().canReach(new Position(3211,3389,0)))
    		getWalking().walk(new Area(3211,3389,3212,3386));
    	else if(getMap().canReach(new Position(3209,3378,0)))
    		getWalking().walk(new Area(3207,3376,3209,3378));
    	else if(getMap().canReach(new Position(3211,3366,0)))
    		getWalking().walk(new Area(3211,3366,3212,3363));
    	else if(getMap().canReach(new Position(3208,3357,0)))
    		getWalking().walk(new Area(3208,3357,3209,3354));
    	else if(getMap().canReach(new Position(3204,3347,0)))
    		getWalking().walk(new Area(3204,3347,3205,3344));
    	else if(getMap().canReach(new Position(3207,3338,0)))
    		getWalking().walk(new Area(3207,3338,3209,3334));
    	else if(getMap().canReach(new Position(3212,3329,0)))
    		getWalking().walk(new Area(3212,3329,3215,3326));
    	else if(getMap().canReach(new Position(3220,3320,0)))
    		getWalking().walk(new Area(3220,3320,3222,3317));
    	else if(getMap().canReach(new Position(3223,3313,0)))
    		getWalking().walk(new Area(3225,3310,3223,3313));
    	else if(getMap().canReach(new Position(3229,3308,0)))
    		getWalking().walk(new Area(3229,3308,3232,3307));
    	else if(getMap().canReach(new Position(3236,3306,0)))
    		getWalking().walk(new Area(3238,3303,3236,3306));
    	else if(getMap().canReach(new Position(3238,3297,0)))
    		getWalking().walk(new Area(3238,3297,3238,3294));
    	else if(getMap().canReach(new Position(3239,3288,0)))
    		getWalking().walk(new Area(3239,3288,3238,3287));
    	else if(getMap().canReach(new Position(3241,3276,0)))
    		getWalking().walk(new Area(3241,3276,3242,3272));
    	else if(getMap().canReach(new Position(3241,3266,0)))
    		getWalking().walk(new Area(3241,3266,3242,3263));
    	else if(getMap().canReach(new Position(3234,3261,0)))
    		getWalking().walk(new Area(3234,3261,3232,3262));
    	else if(getMap().canReach(new Position(3224,3262,0)))
    		getWalking().walk(new Area(3224,3262,3222,3261));
    	else if(getMap().canReach(new Position(3216,3258,0)))
    		getWalking().walk(new Area(3216,3258,3214,3255));
    	else if(getMap().canReach(new Position(3210,3254,0)))
    		getWalking().walk(new Area(3210,3254,3208,3253));
    	else if(getMap().canReach(new Position(3201,3248,0)))
    		getWalking().walk(new Area(3201,3248,3199,3247));
    }
    
	private String ft(long duration) {
		String res = "";
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		long hours = TimeUnit.MILLISECONDS.toHours(duration)
				- TimeUnit.DAYS.toHours(TimeUnit.MILLISECONDS.toDays(duration));
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration)
				- TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS
						.toHours(duration));
		long seconds = TimeUnit.MILLISECONDS.toSeconds(duration)
				- TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS
						.toMinutes(duration));
		if (days == 0L) {
			res = hours + ":" + minutes + ":" + seconds;
		} else {
			res = days + ":" + hours + ":" + minutes + ":" + seconds;
		}
		return res;
	}
}