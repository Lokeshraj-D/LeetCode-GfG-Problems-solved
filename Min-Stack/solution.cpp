class MinStack {
public:
    stack<int> s;
    stack<int> minS;
    int h=0;
    MinStack() {
        cout << "constructor has been created";
    }
    
    void push(int val) {
        s.push(val);
        if(h){
            int f = minS.top();
            if(f>val)
                minS.push(val);
            else
                minS.push(f);
        }
        else{
            minS.push(val);
        }
        h++;
    }
    
    void pop() {
        s.pop();
        minS.pop();
        h--;
    }
    
    int top() {
        return s.top();
    }
    
    int getMin() {
        return minS.top();
    }
};

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack* obj = new MinStack();
 * obj->push(val);
 * obj->pop();
 * int param_3 = obj->top();
 * int param_4 = obj->getMin();
 */
