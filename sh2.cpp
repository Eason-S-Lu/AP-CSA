#include <iostream>
#include <vector>
double sumList(const std::vector<double>& list) {
    double sum = 0.00;
    for (int i = 0; i < list.size(); i++) {
        sum += list[i];
    }
    return sum;
}
int main() {
    std::vector<double> theList;
    theList.push_back(1.5);
    theList.push_back(2.0);
    theList.push_back(3.2);
    theList.push_back(4.8);

    std::cout << sumList(theList) << std::endl;

    return 0;
}