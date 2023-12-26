package persons;
public class PlacePositionPerson {
    int x;
    int y;

    PlacePositionPerson(int x, int y){
        this.x = x;
        this.y = y;
    }

    public float distance(PlacePositionPerson positionPerson1){
        float distance;
        int x1 = positionPerson1.x;        
        int y1 = positionPerson1.y;        

        distance = (float)Math.sqrt(Math.pow(x - x1, 2) + Math.pow(y - y1, 2));
        
        return distance;
    }


}
