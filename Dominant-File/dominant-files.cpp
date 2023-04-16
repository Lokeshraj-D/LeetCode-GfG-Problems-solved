class Solution{
public:

    void merge(vector<int> &arr, int l, int m, int r)
    {
        int i, j, k;
        int n1 = m - l + 1;
        int n2 = r - m;
     
        /* create temp arrays */
        int L[n1], R[n2];
     
        /* Copy data to temp arrays L[] and R[] */
        for (i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for (j = 0; j < n2; j++)
            R[j] = arr[m + 1 + j];
     
        /* Merge the temp arrays back into arr[l..r]*/
        i = 0; // Initial index of first subarray
        j = 0; // Initial index of second subarray
        k = l; // Initial index of merged subarray
        while (i < n1 && j < n2) {
            if (L[i] >= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
     
        /* Copy the remaining elements of L[], if there
        are any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
     
        /* Copy the remaining elements of R[], if there
        are any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
     
    /* l is for left index and r is right index of the
    sub-array of arr to be sorted */
    void mergeSort(vector<int> &arr, int l, int r)
    {
        if (l < r) {
            // Same as (l+r)/2, but avoids overflow for
            // large l and h
            int m = l + (r - l) / 2;
     
            // Sort first and second halves
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
     
            merge(arr, l, m, r);
        }
    }
    /*int partition(vector<int> &arr, int l, int h){
        int i=l-1;
        int piv=arr[h];
        for(int j=l;j<h;j++){
            if(arr[j]>=piv){
                i++;
                swap(arr[i], arr[j]);
            }
        }
        swap(arr[i+1],arr[h]);
        return i+1;
    }
    
    void quickSort(vector<int> &arr, int l, int h){
        if(l>=h)
            return;
        int part=partition(arr,l,h);
        quickSort(arr,l,part-1);
        quickSort(arr, part+1, h);
    }*/
    
    void printArr(vector<int> &arr){
        for(int i=0;i<arr.size();i++)
            cout << arr[i] << " ";
        cout << endl;
    }
    
    int dominantPairs(int n,vector<int> &arr){
        int mid=n/2;
        //arr[4]=9;
        mergeSort(arr,0, mid-1);
        mergeSort(arr, mid, n-1);
        
        //printArr(arr);
        int i=0;
        int j=mid;
        int c=0;
        while(i<mid){
            //cout << arr[i] << " " << arr[j] << endl;
            if(arr[i] >= 5*arr[j]){
                c+=n-j;
                i++;
            }
            else{
                j++;
                if(j==n)
                    break;
                
            }
        }
        return c;
    }  
};
