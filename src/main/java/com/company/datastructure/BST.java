package com.company.datastructure;

public class BST<T> {
    public BTNode root;
    public int size;

    public BST() { }

    // add node to the tree
    public void add(T e) {
        BTNode<T> n = new BTNode<>(e);
        if (root == null)
            root = n;
        else {
            if (e instanceof Integer) {
                BTNode ptr = root;
                while (ptr != null) {
                    if ((Integer) n.data > (Integer) ptr.data) {
                        if (ptr.right == null) break;
                        ptr = ptr.right;
                    } else {
                        if (ptr.left == null) break;
                        ptr = ptr.left;
                    }
                }
                if ((Integer) n.data > (Integer) ptr.data) {
                    ptr.right = n;
                    n.parent = ptr;
                } else {
                    ptr.left = n;
                    n.parent = ptr;
                }
            } else if (e instanceof Long) {
                BTNode ptr = root;
                while (ptr != null) {
                    if ((Long) n.data > (Long) ptr.data) {
                        if (ptr.right == null) break;
                        ptr = ptr.right;
                    } else {
                        if (ptr.left == null) break;
                        ptr = ptr.left;
                    }
                }
                if ((Long) n.data > (Long) ptr.data) {
                    ptr.right = n;
                    n.parent = ptr;
                } else {
                    ptr.left = n;
                    n.parent = ptr;
                }
            } else if (e instanceof Double) {
                BTNode ptr = root;
                while (ptr != null) {
                    if ((Double) n.data > (Double) ptr.data) {
                        if (ptr.right == null) break;
                        ptr = ptr.right;
                    } else {
                        if (ptr.left == null) break;
                        ptr = ptr.left;
                    }
                }
                if ((Double) n.data > (Double) ptr.data) {
                    ptr.right = n;
                    n.parent = ptr;
                } else {
                    ptr.left = n;
                    n.parent = ptr;
                }
            } else if (e instanceof Character) {
                BTNode ptr = root;
                while (ptr != null) {
                    if ((Character) n.data > (Character) ptr.data) {
                        if (ptr.right == null) break;
                        ptr = ptr.right;
                    } else {
                        if (ptr.left == null) break;
                        ptr = ptr.left;
                    }
                }
                if ((Character) n.data > (Character) ptr.data) {
                    ptr.right = n;
                    n.parent = ptr;
                } else {
                    ptr.left = n;
                    n.parent = ptr;
                }
            } else if (e instanceof String) {
                BTNode ptr = root;
                while (ptr != null) {
                    if (((String) n.data).compareTo((String) ptr.data) > 0) {
                        if (ptr.right == null) break;
                        ptr = ptr.right;
                    } else {
                        if (ptr.left == null) break;
                        ptr = ptr.left;
                    }
                }
                if (((String) n.data).compareTo((String) ptr.data) > 0) {
                    ptr.right = n;
                    n.parent = ptr;
                } else {
                    ptr.left = n;
                    n.parent = ptr;
                }
            }
        }
        size++;
    }

    // search for an element k in the tree
    public boolean search(T k) {
        class se { }
        return new se() {
            public boolean search(BTNode ptr, T k) {
                if (k instanceof Integer) {
                    if (ptr == null) return false;
                    else if ((Integer) k - (Integer) ptr.data == 0) return true;
                    if ((Integer) k < (Integer) ptr.data)
                        return search(ptr.left, k);
                    else
                        return search(ptr.right, k);
                } else if (k instanceof Long) {
                    if (ptr == null) return false;
                    else if ((Long) k - (Long) ptr.data == 0) return true;
                    if ((Long) k < (Long) ptr.data)
                        return search(ptr.left, k);
                    else
                        return search(ptr.right, k);
                } else if (k instanceof Double) {
                    if (ptr == null) return false;
                    else if ((Double) k - (Double) ptr.data == 0) return true;
                    if ((Double) k < (Double) ptr.data)
                        return search(ptr.left, k);
                    else
                        return search(ptr.right, k);
                } else if (k instanceof Character) {
                    if (ptr == null) return false;
                    else if ((Character) k - (Character) ptr.data == 0) return true;
                    if ((Character) k < (Character) ptr.data)
                        return search(ptr.left, k);
                    else
                        return search(ptr.right, k);
                } else if (k instanceof String) {
                    if (ptr == null) return false;
                    else if (((String) k).compareTo((String) ptr.data) == 0) return true;
                    if (((String) k).compareTo((String) ptr.data) < 0)
                        return search(ptr.left, k);
                    else
                        return search(ptr.right, k);
                }
                return false;
            }
        }.search(root, k);
    }

    // we need this function in successor function
    private BTNode searchN(BTNode ptr, T k) {
        if (k instanceof Integer) {
            if (ptr == null || (Integer) k - (Integer) ptr.data == 0) return ptr;
            if ((Integer) k < (Integer) ptr.data)
                return searchN(ptr.left, k);
            else
                return searchN(ptr.right, k);
        } else if (k instanceof Long) {
            if (ptr == null || (Long) k - (Long) ptr.data == 0) return ptr;
            if ((Long) k < (Long) ptr.data)
                return searchN(ptr.left, k);
            else
                return searchN(ptr.right, k);
        } else if (k instanceof Double) {
            if (ptr == null || (Double) k - (Double) ptr.data == 0) return ptr;
            if ((Double) k < (Double) ptr.data)
                return searchN(ptr.left, k);
            else
                return searchN(ptr.right, k);
        } else if (k instanceof Character) {
            if (ptr == null || (Character) k - (Character) ptr.data == 0) return ptr;
            if ((Character) k < (Character) ptr.data)
                return searchN(ptr.left, k);
            else
                return searchN(ptr.right, k);
        } else if (k instanceof String) {
            if (ptr == null || ((String) k).equals((String) ptr.data)) return ptr;
            if (((String) k).compareTo((String) ptr.data) < 0)
                return searchN(ptr.left, k);
            else
                return searchN(ptr.right, k);
        }
        return null;
    }

    // find the minimum element in the tree
    public T min() {
        if (root == null) {
            System.out.println("The tree is empty");
            return (T) "";
        } else {
            BTNode ptr = root;
            while (ptr.left != null) {
                ptr = ptr.left;
            }
            return (T) ptr.data;

        }
    }

    // find the maximum element in the tree
    public T max() {
        if (root == null) {
            System.out.println("The tree is empty");
            return (T) "";
        } else {
            BTNode ptr = root;
            while (ptr.right != null) {
                ptr = ptr.right;
            }
            return (T) ptr.data;
        }
    }

    // find the successor element of x in the tree
    public T successor(T x) {
        T e = (T) "";
        if (root == null)
            System.out.println("The tree is empty");
        else {
            BTNode ptr = searchN(root, x);
            if (ptr == null) System.out.println(x + " is not found");
            else if (ptr.right != null) {
                ptr = ptr.right;
                while (ptr.left != null) {
                    ptr = ptr.left;
                }
                e = (T) ptr.data;
            } else {
                BTNode ptr2 = ptr.parent;
                while (ptr2 != null) {
                    if (ptr2.left == ptr) break;
                    else {
                        ptr = ptr2;
                        ptr2 = ptr2.parent;
                    }
                }

                if (ptr2 == null)
                    System.out.println(x + " is the largest element"
                            + " ,so it has no successor");
                else
                    e = (T) ptr2.data;
            }
        }
        return e;
    }

    // we need this method to determine the successor node
    // when we delete a Node with 2 children
    private BTNode successorN(T x) {
        if (root == null) return null;
        else {
            BTNode ptr = searchN(root, x);
            if (ptr.right != null) {
                ptr = ptr.right;
                while (ptr.left != null) {
                    ptr = ptr.left;
                }
                return ptr;
            } else {
                BTNode ptr2 = ptr.parent;
                while (ptr2 != null) {
                    if (ptr2.left == ptr) break;
                    else {
                        ptr = ptr2;
                        ptr2 = ptr2.parent;
                    }
                }

                if (ptr2 == null)
                    return null;
                else
                    return ptr2;
            }
        }
    }

    // delete an element x from the tree
    public void delete(T x) {
        if (root == null) System.out.println("No elements to delete");
        else {
            BTNode ptr = searchN(root, x);
            if (ptr == null) {
                System.out.println(x + " is not found");
                return;
            }
            if (ptr.left == null && ptr.right == null) {
                if (ptr == root) root = null;
                else {
                    BTNode ptr2 = ptr.parent;
                    if (ptr2.left == ptr)
                        ptr2.left = null;
                    else
                        ptr2.right = null;

                }
                size--;
            } else if (ptr.left == null || ptr.right == null) {
                if (ptr == root && ptr.left != null) {
                    root = root.left;
                    root.parent = null;
                } else if (ptr == root && ptr.right != null) {
                    root = root.right;
                    root.parent = null;
                } else {
                    BTNode ptr2 = ptr.parent;
                    if (ptr == ptr2.left) {
                        if (ptr.left != null) ptr2.left = ptr.left;
                        else ptr2.left = ptr.right;
                        ptr2.left.parent = ptr2;
                    } else {
                        if (ptr.left != null) ptr2.right = ptr.left;
                        else ptr2.right = ptr.right;
                        ptr2.right.parent = ptr2;
                    }
                }
                size--;
            } else {
                BTNode succ = successorN(x);
                ptr.data = succ.data;
                deleteN(succ);
                size--;
            }
        }
    }

    // we need this method to delete the successor Node
    // of the node that has 2 children
    private void deleteN(BTNode ptr) {
        if (ptr.right == null) {
            ptr = ptr.parent;
            ptr.right = null;
        } else {
            BTNode ptr2 = ptr.parent;
            if (ptr == ptr2.left) {
                ptr2.left = ptr.right;
                ptr2.left.parent = ptr2;
            } else {
                ptr2.right = ptr.right;
                ptr2.right.parent = ptr2;
            }
        }
    }

    // preorder function
    public void preorder() {
        class pre { }
        new pre() {
            public void preorder(BTNode ptr) {
                if (ptr == null) {
                } else {
                    System.out.print(ptr.data + " ");
                    preorder(ptr.left);
                    preorder(ptr.right);
                }
            }
        }.preorder(root);
    }

    // inorder function
    public void inorder() {
        class in { }
        new in() {
            public void inorder(BTNode ptr) {
                if (ptr == null) {
                } else {
                    inorder(ptr.left);
                    System.out.print(ptr.data + " ");
                    inorder(ptr.right);
                }
            }
        }.inorder(root);
    }

    // postorder function
    public void postorder() {
        class post { }
        new post() {
            public void postorder(BTNode ptr) {
                if (ptr == null) {
                } else {
                    postorder(ptr.left);
                    postorder(ptr.right);
                    System.out.print(ptr.data + " ");
                }
            }
        }.postorder(root);
    }
}