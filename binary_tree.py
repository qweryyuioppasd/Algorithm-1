class Tree:
    def __init__(self,value):
        self.value=value
        self.left=None
        self.right=None

#前序遍历
def preOrder(root):
    if root is None:
        return []
    #根，左，右
    return [root.value]+preOrder(root.left)+preOrder(root.right)

#中序遍历
def inOrder(root):
    if root is None:
        return []
    #左，根，右
    return inOrder(root.left)+[root.value]+inOrder(root.right)

#后序遍历
def lastOrder(root):
    if root is None:
        return []
    #左，右，根
    return lastOrder(root.left)+lastOrder(root.right)+[root.value];

root1=Tree(1);
root1.left=Tree(2);
root1.right=Tree(3);
root1.left.left=Tree(4);
root1.left.right=Tree(5);
root1.right.right=Tree(6);
print(preOrder(root1));
print(inOrder(root1));
print(lastOrder(root1));



#题目代码：
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def inorderTraversal(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        if root is None:
            return []
        
        return self.inorderTraversal(root.left)+[root.val]+self.inorderTraversal(root.right);
        