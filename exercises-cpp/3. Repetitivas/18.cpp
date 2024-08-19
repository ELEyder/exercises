#include <iostream>
#include <string>
#include <regex>
using namespace std;
std::string ltrim(const std::string &s) {
    return std::regex_replace(s, std::regex("^\\s+"), std::string(""));
}
 
std::string rtrim(const std::string &s) {
    return std::regex_replace(s, std::regex("\\s+$"), std::string(""));
}
 
std::string trim(const std::string &s) {
    return ltrim(rtrim(s));
}
 
int main()
{
    system("cls");
    std::string s = "";
    printf("ltrim:\nTexto: ");cin>>s;
    std::cout <<trim(s);
 
    return 0;
}