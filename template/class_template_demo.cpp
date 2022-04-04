#include <iostream>
using namespace std;

template <class NameType, class AgeType>
class Person
{
public:
    Person(NameType name, AgeType age)
    {
        this->m_Name = name;
        this->m_Age = age;
    }
    NameType m_Name;
    AgeType m_Age;

    void showInfo()
    {
        cout << "姓名：" << this->m_Name << " "
             << "年龄：" << this->m_Age << endl;
    }
};

//类模板没有自动类型推导
void test01()
{
    Person<string, int> p("杨间", 23);
    p.showInfo();
}

int main()
{
    test01();
    return 0;
}