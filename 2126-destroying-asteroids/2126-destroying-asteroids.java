class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);

        long currMass=mass;

        for(int x:asteroids){
            if(x<=currMass){
                currMass+=x;
            }else{
                return false;
            }
        }
        return true;
    }
}