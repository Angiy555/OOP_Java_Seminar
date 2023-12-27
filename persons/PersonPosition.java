package persons;
public class PersonPosition {
    int x;
    int y;

    PersonPosition(int x, int y){
        this.x = x;
        this.y = y;
    }

    public float getDistance(PersonPosition personPosition){
        float distance;
        int x1 = personPosition.x;
        int y1 = personPosition.y;

        distance = (float)Math.sqrt(Math.pow(this.x - x1, 2) + Math.pow(this.y - y1, 2));

        return distance;
    }


}
