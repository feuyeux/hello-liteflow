# Hello LiteFlow

> https://github.com/dromara/liteflow

- 普通组件 `HelloNode`
- 选择组件 `HelloNodeSwitch`
- 布尔组件 `HelloNodeBoolean`
- 次数循环组件 `HelloNodeFor`
- 迭代循环组件 `HelloNodeIterator`

串行编排

```xml
<chain name="chain1">
    THEN(a, b, c, d);
</chain>
```

```xml
<chain name="chain1">
SER(a, b, c, d);
</chain>
```

并行编排

```xml
<chain name="chain1">
    WHEN(a, b, c);
</chain>
```

```xml
<chain name="chain1">
PAR(a, b, c);
</chain>
```

选择编排
    
```xml
<chain name="chain1">
    SWITCH(a).to(b, c, d);
</chain>
```

条件编排

```xml
<chain name="chain1">
    THEN(
        IF(x, a, b),
        c
    );
</chain>
```

循环编排

```xml
<chain name="chain1">
    FOR(5).DO(THEN(a, b));
</chain>
```

```xml
<chain name="chain1">
ITERATOR(x).DO(THEN(a, b));
</chain>
```

```xml
<chain name="chain1">
FOR(f).DO(THEN(a, b)).BREAK(c);
</chain>
```