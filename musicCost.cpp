#include <iostream>
using namespace std;
 int main(void)
{
     int songs;
     float totalCost;
     float costPerSong = 0.99;
     cout << "Welcome To Music World." << "\n";
     cout << "How many songs would you like to purchase?";
     cin >> songs;
     totalCost = costPerSong * songs;
     cout << "Your total cost is: " << totalCost << "\n";
     cout << "Thank you for shopping with us";
     return 0;
}
