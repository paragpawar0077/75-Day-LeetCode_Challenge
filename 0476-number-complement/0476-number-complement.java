class Solution {
    public int findComplement(int num) {
int mask = (1 << Integer.toBinaryString(num).length()) - 1;
int complement = num ^ mask;

return complement;
    }
}