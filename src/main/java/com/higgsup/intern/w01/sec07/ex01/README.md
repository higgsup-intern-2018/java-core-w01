1.


2. If equals() returns true => hashCode() comparision return true
   If hashCode() return true => equals() might return true or false
   => A is incorrect since equals() return true, hashCode() comparision must return true
   => B is correct since equals() return false, hashCode() comparision might return true or false
   => C is incorrect since equals() can return true or false if hashCode() comparision return true
   => D is correct since equals() can return true or false if hashCode() comparision return true
   => E is incorrect since hashCode() comparision != return false then equals() must return false
   => Correct answer: B, D.