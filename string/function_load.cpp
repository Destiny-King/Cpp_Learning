#include <iostream>
using namespace std;

class Person
{
public:
    int m_age;

    Person()
    {
        cout << "Person无参构造函数调用。" << endl;
    }

    Person(int age)
    {
        m_age = age;
        cout << "Person有参构造函数调用。" << endl;
        // cout << "age = " << m_age << endl;
    }

    Person(const Person &p)
    {
        m_age = p.m_age;
        cout << "Person拷贝构造函数调用" << endl;
        // cout << "age = " << m_age << endl;
    }

    ~Person()
    {
        cout << "Person析构函数调用。" << endl;
    }
};

void test()
{
    Person p1;
    Person p2(10);
    Person p3(p2);
    cout << "age = " << p3.m_age << endl;
}

int main()
{
    test();
    return 0;
}