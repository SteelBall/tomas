#include <iostream>
#include <vector>
using namespace std;

//template <typename T>
bool expand(int *&vec, int &size)
{
  int *newVec, newSize = size+1; // Ny vektor, ny storlek
  try {
    newVec = new int[newSize]; // Skapa ny vektor som �r 25% st�rre
  }
  catch (std::bad_alloc){
    return false;
  }
  // Kopiera element fr�n gammal vektor till ny
  for (int i = 0; i < size; ++i){
    cout << "in expand, copying old to new " << vec[i] << endl;
    cout << "in expand, copying old to new " << vec[i+1] << " index = " << i << endl;
    newVec[i] = vec[i];
  }
  // Avallokera den gamla vektorn
  delete[ ] vec;
  // L�t den gamla vektorn peka p� den nya och uppdatera storleken
  vec = newVec;
  size = newSize;
  return true;
}


void write_vector(int a[], int num_elements)
{
   cout << "The numbers in the vector are: " << endl;
  for(int i=0; i < num_elements; i++)
    cout << a[i] << " ";
}

int main()
{
  int input;

  int num_elements = 0;
  int *pointerToVector = NULL;


  
  cout << "Enter your numbers to be evaluated: " << endl;
  while (cin >> input) {
    cout << "number of elements " << num_elements << " input = " << input << endl;
    if (expand(pointerToVector, num_elements)){
      cout << " in expand, num of elements (index) =  " << num_elements << endl;
      pointerToVector[num_elements-1] = input;
      cout << " pointerToVector[x] = " << pointerToVector[num_elements] << endl;
    }
    else {
      cin.ignore(80,'\n');
    }
  }

  //V2 = V1;
  write_vector(pointerToVector, num_elements );
  return 0;
}
