
/*
*哈希表的关键思想是使用哈希函数map keys to buckets。更具体，y = x％5
* 1.当我们插入一个新密钥时，哈希函数将决定应该分配密钥的哪个桶，密钥将存储在相应的桶中;
* 2.当我们想要搜索密钥时，哈希表将使用  same 哈希函数来查找相应的桶并仅在特定桶中搜索。
* 哈希函数将取决于（x键值）the range of key values和（y桶的索引）the number of buckets。
* */
public class Hash_1 {
}
